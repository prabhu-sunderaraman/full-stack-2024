package com.indium;

public class BuilderPattern {
    public static void main(String[] args) {
        //Builder Pattern - Creational Pattern
        //Separates the construction of a complex object from its representation

        SouthIndianBuffet myBuffet = new SouthIndianBuffet.Builder()
                .setRice("Basmati Rice")
                .setSambar("Tomato Sambar")
                .setRasam("Pepper Rasam")
                .setCurd("Fresh Curd")
                .setPayasam("Vermicelli Payasam")
                .build();

        // Output the selected buffet items
        System.out.println(myBuffet);

        // You can access individual items using getter methods as well
        System.out.println("Rice: " + myBuffet.getRice());
        System.out.println("Sambar: " + myBuffet.getSambar());

        SouthIndianBuffet myBuffet2 = new SouthIndianBuffet.Builder()
                .setRice("Brown Rice")
                .setRasam("Lemon Rasam")
                .setCurd("Buttermilk")
                .build();
    }
}

class SouthIndianBuffet {
    private String rice;
    private String sambar;
    private String rasam;
    private String curd;
    private String payasam;

    // Private constructor so only the Builder can instantiate
    private SouthIndianBuffet(Builder builder) {
        this.rice = builder.rice;
        this.sambar = builder.sambar;
        this.rasam = builder.rasam;
        this.curd = builder.curd;
        this.payasam = builder.payasam;
    }

    public String getRice() {
        return rice;
    }

    public String getSambar() {
        return sambar;
    }

    public String getRasam() {
        return rasam;
    }

    public String getCurd() {
        return curd;
    }

    public String getPayasam() {
        return payasam;
    }

    // Builder class for SouthIndianBuffet
    public static class Builder {
        private String rice;
        private String sambar;
        private String rasam;
        private String curd;
        private String payasam;

        public Builder() {
            // Default constructor for the builder
        }

        public Builder setRice(String rice) {
            this.rice = rice;
            return this;
        }

        public Builder setSambar(String sambar) {
            this.sambar = sambar;
            return this;
        }

        public Builder setRasam(String rasam) {
            this.rasam = rasam;
            return this;
        }

        public Builder setCurd(String curd) {
            this.curd = curd;
            return this;
        }

        public Builder setPayasam(String payasam) {
            this.payasam = payasam;
            return this;
        }

        // Build method to return the final SouthIndianBuffet object
        public SouthIndianBuffet build() {
            return new SouthIndianBuffet(this);
        }
    }

    @Override
    public String toString() {
        return "SouthIndianBuffet [rice=" + rice + ", sambar=" + sambar + ", rasam=" + rasam + ", curd=" + curd
                + ", payasam=" + payasam + "]";
    }
}
