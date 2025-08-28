package edu.practice.day3;

public class Practice5 {
    private String brand;
    private String model;
    private int fuel;
    private int speed = 0; // 현재 속도, 기본값 0
    private boolean isEngineOn = false; // 엔진 상태, 기본값 false
    private int totalDistance = 0; // 총 주행거리, 기본값 0

    public Practice5() {
    }

    public Practice5(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.fuel = 100;
    }

    public Practice5(String brand, String model, int fuel, int speed, boolean isEngineOn, int totalDistance) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.speed = speed;
        this.isEngineOn = isEngineOn;
        this.totalDistance = totalDistance;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void startEngine() {
        if (isEngineOn() == true) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else if (isEngineOn() == false) {
            if (getFuel() <= 0) {
                System.out.println("연료가 부족하여 시동을 걸 수 없습니다.");
            } else {
                System.out.println(getModel() + " 엔진이 시동되었습니다.");
                setEngineOn(true);
            }
        }
    }

    public void stopEngine() {
        if (isEngineOn() == false) {
            System.out.println("이미 시동이 정지해있습니다.");
        } else {
            System.out.println(getModel() + " 엔진이 정지되었습니다.");
            setEngineOn(false);
            setSpeed(0);
        }
    }

    public void accelerate(int speedUp) {
        if (isEngineOn() == false) {
            System.out.println("엔진이 꺼져있어 가속할 수 없습니다.");
        } else if (getFuel() <= 0) {
            System.out.println("연료가 없어 가속할 수 없습니다.");
        } else {
            System.out.println(speedUp + "km/h로 가속했습니다. 현재 속도: " + speedUp + "km/h");
            setSpeed(speedUp);
        }
    }

    public void brake(int speedDown) {
        if (isEngineOn() == false) {
            System.out.println("엔진이 꺼져있어 감속할 수 없습니다.");
        } else {
            System.out.println(speedDown + "km/h로 감속했습니다. 현재 속도: " + speedDown + "km/h");
            setSpeed(speedDown);
        }

    }

    public void refuel(int amount) {
        if (getFuel() + amount > 100) {
            setFuel(100);
        } else {
            setFuel(getFuel() + amount);
        }
    }

    public void drive(int distance) {
        if (isEngineOn() == false) {
            System.out.println("엔진이 꺼져있어 주행할 수 없습니다.");
        } else {
            int fuelNeeded = distance / 10; // 10km당 1L 소모
            if (getFuel() < fuelNeeded) {
                System.out.println("연료가 부족하여 " + distance + "km를 주행할 수 없습니다.");
                return;
            } else {
                System.out.println(distance + "km 주행했습니다. 연료 " + fuelNeeded + "L 소모되었습니다.");
                setFuel(getFuel() - fuelNeeded);
                setTotalDistance(getTotalDistance() + distance);
                if (getFuel() <= 0) {
                    System.out.println("연료가 모두 소모되었습니다. 엔진을 정지합니다.");
                }
            }
        }
    }

    public void displayCarInfo() {
        System.out.println("=== 자동차 정보 ===");
        System.out.println("브랜드: " + getBrand());
        System.out.println("모델: " + getModel());
        System.out.println("연료량: " + getFuel() + "L");
        System.out.println("속도: " + getSpeed() + "km/h");
        System.out.println("엔진상태: " + (isEngineOn() ? "ON" : "OFF"));
        System.out.println("총 주행거리: " + getTotalDistance() + "km");
        System.out.println();
    }
}
