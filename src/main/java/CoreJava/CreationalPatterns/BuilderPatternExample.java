package CoreJava.CreationalPatterns;

// Product class
class Computer {
    // Required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // Private constructor to enforce object creation through Builder
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Static nested class for Builder
    public static class ComputerBuilder {
        // Required parameters
        private String HDD;
        private String RAM;

        // Optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // Method to build the object
        public Computer build() {
            return new Computer(this);
        }
    }
}

// Main class to test the Builder pattern
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Create a Computer object using the Builder
        Computer computer = new Computer.ComputerBuilder("500 GB", "8 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        // Print the specifications of the computer
        System.out.println("HDD: " + computer.getHDD()); // Output HDD: 500 GB
        System.out.println("RAM: " + computer.getRAM()); // Output: RAM: 8 GB
        System.out.println("Graphics Card Enabled: " + computer.isGraphicsCardEnabled()); // Output: Graphics Card Enabled: true
        System.out.println("Bluetooth Enabled: " + computer.isBluetoothEnabled()); // Output Bluetooth Enabled: true
    }
}
