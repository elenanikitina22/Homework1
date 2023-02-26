package warehouse.elena.warehouse.services.impl;
import warehouse.elena.warehouse.model.Socks;
import warehouse.elena.warehouse.model.SocksColor;
import warehouse.elena.warehouse.model.SocksSize;
import warehouse.elena.warehouse.services.SocksServices;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SocksServicesImpl implements SocksServices {
    private List<Socks> socksList = new ArrayList<Socks>();
    private int id = 0;

    @Override
    public Socks addSocks(Socks socks)
    {
        if (socksList.contains(socks))
        {
            int index = socksList.indexOf(socks);
            Socks obj = socksList.get(index);
            obj.setQuantity(obj.getQuantity() + socks.getQuantity());
            socksList.set(index, obj);
            return obj;
        }
        else
        {
            socksList.add(socks);
            return socks;
        }
    }

    @Override
    public Socks takeSocks(Socks socks)
    {
        if (socksList.contains(socks))
        {
            int index = socksList.indexOf(socks);
            Socks obj = socksList.get(index);

            if (obj.getQuantity() >= socks.getQuantity())
            {
                obj.setQuantity(obj.getQuantity() - socks.getQuantity());
                socksList.set(index, obj);
                return obj;
            }
        }

        return null;
    }

    @Override
    public int geTotalNumberOfSocks(SocksColor color, SocksSize size, int cottonMin, int cottonMax) throws IllegalArgumentException
    {
        int total = 0;

        if (color == null || size == null)
            throw new IllegalArgumentException("Некорректные значения");

        for (Socks item : socksList)
        {
            if (item.getColor() == color && item.getSize() == size
                    && (item.getCottonPart() >= cottonMin && item.getCottonPart() <= cottonMax))
            {
                total += item.getQuantity();
            }
        }

        return total;
    }

    @Override
    public Socks deleteSocks(Socks socks)
    {
        if (socksList.contains(socks))
        {
            int index = socksList.indexOf(socks);
            Socks obj = socksList.get(index);
            socksList.remove(socks);
            return obj;
        }

        return null;
    }
}