package LambdaExpressions;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.time.LocalTime;
class SmartLight {
    private String location;
    private int brightness;
    private String color;
    private boolean isOn;
    
    public SmartLight(String location) {
        this.location = location;
        this.brightness = 0;
        this.color = "white";
        this.isOn = false;
    }
    
    public void setBrightness(int brightness) { this.brightness = brightness; }
    public void setColor(String color) { this.color = color; }
    public void setOn(boolean on) { this.isOn = on; }
    public String getLocation() { return location; }
    public boolean isOn() { return isOn; }
    public int getBrightness() { return brightness; }
    public String getColor() { return color; }
    
    @Override
    public String toString() {
        return String.format("Light[%s]: %s, Brightness: %d%%, Color: %s", 
            location, isOn ? "ON" : "OFF", brightness, color);
    }
}

class SmartHomeLighting {
    private List<SmartLight> lights;
    @FunctionalInterface
    interface LightBehavior {
        void execute(SmartLight light);
    }
    
    public SmartHomeLighting() {
        lights = Arrays.asList(
            new SmartLight("Living Room"),
            new SmartLight("Kitchen"),
            new SmartLight("Bedroom"),
            new SmartLight("Hallway")
        );
    }
    
    public void activateLights(String trigger, LightBehavior behavior) {
        System.out.println("\n--- " + trigger + " Triggered ---");
        lights.forEach(behavior::execute);
        lights.forEach(System.out::println);
    }
    
    public void demonstrateLightAutomation() {
        System.out.println("=== SMART HOME LIGHTING AUTOMATION ===");

        activateLights("Motion Detection", light -> {
            light.setOn(true);
            light.setBrightness(60);
            light.setColor("warm white");
        });
        activateLights("Evening Mode", light -> {
            light.setOn(true);
            if (light.getLocation().equals("Living Room")) {
                light.setBrightness(80);
                light.setColor("orange");
            } else {
                light.setBrightness(40);
                light.setColor("soft yellow");
            }
        });

        activateLights("Voice Command: Party Mode", light -> {
            light.setOn(true);
            light.setBrightness(100);
            String[] colors = {"red", "blue", "green", "purple", "pink"};
            light.setColor(colors[new Random().nextInt(colors.length)]);
        });

        activateLights("Security Alert", light -> {
            light.setOn(true);
            light.setBrightness(100);
            light.setColor("red");
        });
    }
}
