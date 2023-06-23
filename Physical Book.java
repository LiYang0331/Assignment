class PhysicalBook extends Book {
    private double weight;
    
    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double calculateShippingCost() {
        double initialWeight = 500.0; // in grams
        double extraCharge = 1.0; // for each additional 250g
        double shippingCost = 4.50;
        
        if (weight > initialWeight) {
            double additionalWeight = weight - initialWeight;
            int additionalChargeUnits = (int) Math.ceil(additionalWeight / 250);
            shippingCost += additionalChargeUnits * extraCharge;
        }
        
        return shippingCost;
    }
    
    public double getWeightInPounds() {
        double poundsConversionFactor = 0.00220462; // 1 gram = 0.00220462 pounds
        return weight * poundsConversionFactor;
    }
}
