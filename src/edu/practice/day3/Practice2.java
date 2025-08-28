package edu.practice.day3;

public class Practice2 {
    private String model;
    private int batteryLevel;
    boolean isPowerOn = false;

    public Practice2() {
    }

    public Practice2(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void chargeBattery(int batteryLevel) {
        setBatteryLevel(getBatteryLevel() + batteryLevel);
        System.out.println(batteryLevel + "% 충전되었습니다.");
        if (getBatteryLevel() > 100) {
            setBatteryLevel(100);
        }
    }

    public void useBattery(int batteryLevel) {
        if (isPowerOn()) {
            setBatteryLevel(getBatteryLevel() - batteryLevel);
            System.out.println("배터리를 " + batteryLevel + "% 사용했습니다.");
            if (getBatteryLevel() <= 0) {
                setBatteryLevel(0);
                System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
                powerOff();
            }
        } else {
            System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
        }
    }

    public void powerOn() {
        System.out.println(getModel() + "의 전원이 켜졌습니다.");
        setPowerOn(true);
    }

    public void powerOff() {
        System.out.println(getModel() + "의 전원이 꺼졌습니다.");
        setPowerOn(false);
    }

    public void displayPhone() {
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + getModel());
        System.out.println("배터리: " + getBatteryLevel() + "%");
        System.out.println("전원 상태: " + (isPowerOn() ? "ON" : "OFF"));
        System.out.println();
    }


}
