public abstract class Sweet implements Comparable<Sweet> {
    protected String name;
    protected double weight;
    protected double price;
    protected double sugar;

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    @Override
    public int compareTo(Sweet o) {
        return (int) (this.getPrice() - o.getPrice());
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}