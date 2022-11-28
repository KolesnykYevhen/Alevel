package model;
import java.util.Random;


public class Engine {
        private int power;
        private String type;

        public Engine() {
        }

    public Engine(String type) {
        this.power = new Random().nextInt(1000);
        this.type = type;
    }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
}
