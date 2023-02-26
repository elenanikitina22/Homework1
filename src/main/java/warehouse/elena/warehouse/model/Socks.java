package warehouse.elena.warehouse.model;

public class Socks {
    private SocksColor color;
    private SocksSize size;
    private int cottonPart;
    private int quantity;

    public SocksColor getColor() {
        return color;
    }

    public SocksSize getSize() {
        return size;
    }

    public int getCottonPart() {
        return cottonPart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setColor(SocksColor color) {
        this.color = color;
    }

    public void setSize(SocksSize size) {
        this.size = size;
    }

    public void setCottonPart(int cottonPart) {
        this.cottonPart = cottonPart;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Socks) == false)
            return false;

        Socks socks = (Socks)obj;

        if (socks.getColor() == getColor() && socks.getSize() == getSize() && socks.getCottonPart() == getCottonPart())
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return getColor().hashCode() + getSize().hashCode();
    }
}