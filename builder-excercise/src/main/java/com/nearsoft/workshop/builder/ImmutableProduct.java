package com.nearsoft.workshop.builder;

public class ImmutableProduct {
    private final double price;
    private final String sku;
    private final String name;
    private final String description;


    public ImmutableProduct(double price, String sku, String name, String description) {
        this.price = price;
        this.sku = sku;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static ImmutableProductBuilder builder() {
        return new ImmutableProductBuilder();
    }

    public static class ImmutableProductBuilder {
        private double price;
        private String sku;
        private String name;
        private String description;

        public ImmutableProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ImmutableProductBuilder withSku(String sku) {
            this.sku = sku;
            return this;
        }

        public ImmutableProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ImmutableProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ImmutableProduct build() {
            return new ImmutableProduct(price, sku, name, description);
        }
    }
}
