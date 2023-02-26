package warehouse.elena.warehouse.services;
import warehouse.elena.warehouse.model.Socks;
import warehouse.elena.warehouse.model.SocksColor;
import warehouse.elena.warehouse.model.SocksSize;

public interface SocksServices {
    public Socks addSocks(Socks socks);
    public Socks takeSocks(Socks socks);
    public int geTotalNumberOfSocks(SocksColor color, SocksSize size, int cottonMin, int cottonMax);
    public Socks deleteSocks(Socks socks);
}