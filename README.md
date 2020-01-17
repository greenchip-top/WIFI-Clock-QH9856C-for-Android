# WIFI-Clock-QH9856C-for-Android

### Function Introduction

It is convenient and simple to set up network with a smartphone Apps-QH9856C. Once the WIFI is set up for networking, the city; date and time are automatically synchronized, and no manual adjustment is required.

Apps Setting: 12/24 hours，The default is 12H system AM 12:00

Apps Setting: Hourly chime and hourly chime range

Apps Setting: 1 group/2 groups of alarm clocks, each group of alarm clock up to 2 hours.

Apps Setting: Fixed (time; temperature) display mode or cyclic switching 3 modes display {time（10 seconds）、date（2 seconds）、temperature（2 seconds）

Snooze function, snooze time is 8 minutes.(Alarm and snooze clock are ringing, ALM1 and ALM2 lights flashes. )

Temperature detection, measurement range：-10℃ to 50℃(14℉-122℉) using C103AT temperature sensor, temperature display resolution: 0 ° C - 50 ° C (14 ° F - 122 ° F) using C103AT temperature sensor, temperature display resolution: 1 °C, temperature accuracy: ±1.0 °C. The power-on temperature data is: - - °C. higher than 50 °C, it shows: HH; lower than -10 °C, it shows: LL °C; When it is not detected, it shows: --°C. The temperature is detected once every minute.

Working voltage 3.0V，Powered by a single power supply (AC / DC power), powered by an external DC, the WIFI module is turned on for a long time, it can instantly receive the Apps data status.

After the configuration is successful, it can receive the APP interface function in real time.

### LED Display Picture

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/1.jpg)

### Apps Setting

Cyclic switching 3 modes display time（10 seconds）、date（2 seconds）、temperature（2 seconds）

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/2.png)

### Power-on(Factory reset and WIFI configuration)

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/3.png)

Each time the power is turned back on!, it will automatically reconnect the internet (if the MCU has the previous received record) to obtain the time. If it succeeds, it will display the “SUCC” for 2 seconds and then display the network time; if it fails, the intermediate date will display. 〝-〞 flashes 0.25 seconds and 0.25 seconds off, loop display. In 10 minutes will reconnect the [Router], online server update the time until the time is successfully acquired.

If the QH9856C wifi-Clock, doesn’t connect to the router, it can not receive the network city, date, time, which need mobile phone Apps to reconfigure the QH9856C wifi-Clock. Open the Apps on the phone and set the "account" and "password" of router. QH9856C wifi-Clock also needs to be restored to factory settings, which needs to be powered back on when this screen appears,then power off, and then power on, repeated 3 times. you can enter the SMART CONFIG interface, the user need to use the mobile phone Apps to configure the router again. If it succeeds, it will display the〝SUCC for 2 seconds and then display the network time. If it fails, it will display the date intermediate point 〞-〞flashes 0.25 seconds and 0.25 seconds off., loop display.

The WIFI module is open for a long time and can receive the status of Apps data in real time.
After the configuration succeed, it can receive the APP interface function in real time.
Automatically receive network city, date and time.
After power off, power on again, the fully LED screen is displayed for 5 seconds, and the BIBI 250mS*2 returns back to the time mode. The preset time is displayed first (12H system AM 12:00), and the connection router is detected in the background (50 seconds), then back to network Server update the time. If it receives successfully, will display the〝SUCC for 2 seconds and then display the network time; if it fails, will display the date intermediate point 〞-〞flashes 0.25 seconds and 0.25 seconds off, loop display. After 10 minutes (reset WIFI) will reconnect the [Router], online server update the time until the time is successfully acquired.
When the clock is disconnected from WlFI, the display mode is: when the APP is selected in the time mode, if it is disconnected from WlFI, the display will change to the time display for 4 seconds. When APP selects the loop mode, clock disconnects from WlFI, the display mode will display time, date and temperature.

### Using Instructions

The Smart Phone application (hereafter called Apps) needs to be used with the QH9856C (hereafter called WIFI clock).

[Android Version](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/apk/QH9856C-V1.6.apk)

### Mobile phone APP Interface

Mobile phone Apps called QH9856C.

Open the app then automatically enter the setting country city interface.

#### Setting country city interface

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/4.png)

Setting Step:

Enter the device list interface (perform operation);

Enter to change device name interface (perform operation);

Enter the set-up net interface (perform operation);

Select country (perform operation);

Select city (perform operation);

Send selected country and city data to the device;

Enter the setting country city interface, which is also the current interface;

Enter the alarm clock interface;

Enter the advanced interface;

Enter the description interface.

#### Alarm setting interface 

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/5.png)

Setting Step:

Alarm 1 switch setting (perform operation) {QH9856C (WIFI clock) AL1 indicator light is updated instantly};

Alarm 1 time setting (perform operation)

Alarm 1 repeat mode setting (perform operation); select Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday

Alarm 2 switch setting (perform operation) {QH9856C (WIFI clock) AL2 indicator light update instantly}

Alarm 2 time setting (perform operation);

Alarm 2 repeat mode setting (perform operation); select Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday

Enter the snooze state (perform operation) {QH9856C (WIFI clock) is used when it is ringing}

Stop the alarm sound (perform operation) {QH9856C (WIFI clock) is used when it is ringing}

#### Advanced settings interface

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/6.png)

Setting Step:

Hour system setting (perform operation);

Temperature unit Celsius display selection (perform operation) {QH9856C (WIFI clock) in Celsius unit display temperature mode instantly};

Temperature unit Fahrenheit display selection (perform operation) {QH9856C (WIFI clock) in Fahrenheit unit display temperature mode instantly};

Display mode selection (perform operation) {time, date, temperature mode or loop mode;

Display date (perform operation): month & day and day & month conversion;

Hourly time switch setting (perform operation);

Hourly time start time setting (perform operation);

Hourly time end time setting (perform operation);

Language selection: Chinese simplified, Chinese traditional, English;

#### Help interface 

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/7.jpg)

Setting Step:

Enter the device list interface (perform operation)

Enter to change device name interface (perform operation)

Enter the set-up net interface (perform operation)

Enter the setting country city interface

Enter the alarm clock interface

Enter the advanced interface

Enter the description interface which is also the current interface

#### Device list interface  

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/8.jpg)

Setting Step:

Back to the previous interface

Refresh device

Device 1, click to select this device

Device 2, click to select this device

Device 3, click to select this device

#### Change device name interface

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/9.png)

Setting Step:

Back to the previous interface without saving changes

Save your changes and back to the previous interface

Set a new name

#### Configuration interface 

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/10.jpg)

Setting Step:

Back to the previous interface

Enter Wifi name (perform operation)

Update Wifi name (perform operation);

Enter Wifi password (perform operation)

Choose whether display the password or not (perform operation)

Configuration settings to connect to the router

#### Configuration success and configuration failed

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/11.png)

When the configuration fails, you cannot connect to the wifi clock and need to reconfigure.

### Module Introduction

#### QHM126 WiFi Module Size Data

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/12.png)

#### Foot bit matrix (LQFP48)

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/13.jpg)

#### Foot bit matrix (Die)

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/14.png)

### Application line

[DS QH9856C Application line PDF](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/DS-QH9856C-Application-line.pdf)

The crystal needs to be closest to the wafer and try to avoid placing it with the LED line and the alarm circuit;

Actual capacitance value depends on the difference in seconds;

U1 Encapsulation adopts: QH9856C; 

U2 Encapsulation adopts: XC6206; 

U3 Encapsulation adopts: QHM126 WiFi module;

Each time it is connected (AC / DC), the LED screen is fully displayed 3 seconds at the time of power-on, and the BIBI 250mS*2 returns back to the time mode. 

The preset time is displayed first (12H system AM 12:00), if MCU has data( the previous received record{Router“account”、“password” and “network city”}, it will immediately connect to the [router] online server and update the time in the background. 

If it receives successfully, will display the〝SUCC〞for 2 seconds and then display the network time; if it fails, will display the 〝FAIL〞 for 2 seconds and then display the preset time.

 In 10 minutes, it will reconnect the [Router], online server update the time until the time is successfully acquired.

| I.C.PIN | COM0 | COM1 | COM2 | COM3 |
| ------- | ---- | ---- | ---- | ---- |
| **S0**  | 1A   | 2A   | 3A   | 4A   |
| **S1**  | 1B   | 2B   | 3B   | 4B   |
| **S2**  | 1C   | 2C   | 3C   | 4C   |
| **S3**  | 1D   | 2D   | 3D   | 4D   |
| **S4**  | 1E   | 2E   | 3E   | 4E   |
| **S5**  | 1F   | 2F   | 3F   | 4F   |
| **S6**  | 1G   | 2G   | 3G   | 4G   |
| **S7**  | PM   | P1   | ℉    | ℃    |
| **S8**  | ALM1 | ALM2 | P2   | Date |

If the above information is subject to change without prior notice. Please confirm whether the information in hand is the latest version before use.

We will not be liable for any duty due to the consequences of incorrect or improper operation.

### Android Demo

#### How to Build

You require the following to build Demo:

Latest stable [Oracle JDK 8](http://www.oracle.com/technetwork/java/)

Latest stable [Android Studio 3.5.3](https://developer.android.google.cn/studio/)

##### Copy jar file to LIBS file

Copy the downloaded WiFi clock.jar file to the LIBS directory of the project (the screenshot here takes the official demo as an example), as shown in the figure:

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/16.png)

##### Add jar files to the project

In the libs directory, select the jar file, right-click, and select Add as library, as shown in the figure:

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/17.png)

At this time, it will be found that the corresponding description of the jar file that the project depends on is generated in the dependencies block of build.gradle in the app directory, as shown in the figure:

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/18.png)

##### Configuration AndroidManifest.xml

![image](https://github.com/greenchip-top/WIFI-Clock-QH9856C-for-Android/raw/master/image/1.png)

#### Getting Started

Declare the WIFIclock_9856C class and instantiate the WIFIclock_9856C class in the main thread.

```java
public class MainActivity extends AppCompatActivity {

    WIFIclock_9856C clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clock = new WIFIclock_9856C();
    }
}
```

For the new equipment used for the first time, it is necessary to distribute the network to the equipment, or press the reset key of the equipment three times in succession, and it can actively distribute the network. The following example code describes the implementation process of the distribution network.

```java
// During the network distribution process, there is no callback for more than 30 seconds, which means that it is a failure and relevant judgments need to be made。
clock.configureWIFI("WIFI name","WIFI password");
clock.setSuccessListener(new WIFIclock_9856C.SuccessConfigure() {
    @Override
    public void Success() {
        // Configure network, success
    }
});
clock.setFailListener(new WIFIclock_9856C.FailConfigure() {
    @Override
    public void Fail() {
        // Configure network, failed
    }
});
```

Set the listening event to monitor the device and perform more operations on the device. You can execute the following example code.

```java
clock.setSuccessListener(new WIFIclock_9856C.SuccessListener() {
    @Override
    public void Success(String host, String mac, WIFIclock_9856C.Channel channel) {
        // Successful connection
    }
});
clock.setFailListener(new WIFIclock_9856C.FailListener() {
    @Override
    public void Fail() {
        // disconnect
    }
});
clock.setReturnListener(new WIFIclock_9856C.ReturnListener() {
    @Override
    public void Return(String data) {
        // Data received
    }
});
clock.run(); // start-up
```

Operate the device. When the device is connected successfully, three parameters will be returned.

1.Network IP of the device;

2.Unique MAC sequence of device;

3.Operation class of device ;

#### API reference

This class is a function class that operates the instance of WiFi clock.

```java
public class WIFIclock_9856C.Channel
```

##### To obtain the relevant country and city data

```java
void Channel.getAreaInfo()
```

```java
clock.setReturnListener(new WIFIclock_9856C.ReturnListener() {
    @Override
    public void Return(String data) {
       // json is area data
    }
});
```

Returns a string example in JSON format

```json
[{"e_country":"Canada","t_country":" Canada ","s_country":" Canada ","countryid":"1","city":[{"e_city":"CALGARY","t_city":"Calgary","s_city":"Calgary","countryid":"1"},...]],...}]
```

##### Read the device data

```java
void Channel.getDeviceData()
```

```java
clock.setReturnListener(new WIFIclock_9856C.ReturnListener() {
    @Override
    public void Return(String data) {
       // string data is device data
    }
});
```

Return string example

```json
CHINA,SHENZHEN,0,06221010101,07331010101,0,1,1,00507,2,1,0
```

(Country),(City),(Alarm switch),(Hour Minute Cycle mode),(Hour Minute Cycle mode),(Time mode),(Synchronous interval),(Temperature unit),(Hourly time switch Start time End time),(Display mode),(Alarm beep),(Date display mode).

##### Set the country and city

```java
void Channel.setDeviceArea(String Country, String City);
```

Parameter 1: Country Name (English)  

Parameter 2: City Name (English)

##### Set the alarm time

```java
void Channel.setDeviceAlarm("2", "7", "11", "1111110", "6", "22", "0101010", "1");
```

Parameter 1: turn off two alarm clocks

​				   	0: turn off two alarm clocks

​				   	1: alarm 1 on, alarm 2 off

​				   	2: alarm 1 off, alarm 2 on

​				   	3: turn on two alarm clocks

Parameter 2: alarm clock 1: hour

Parameter 3: alarm clock 1: minute

Parameter 4: alarm clock 1: cycle mode: Sunday Monday Tuesday Wednesday Thursday Friday Saturday(value is 0 or 1)

Parameter 5: alarm clock 2: hour

Parameter 6: alarm clock 2: minute

Parameter 7: alarm clock 2: cycle mode: Sunday Monday Tuesday Wednesday Thursday Friday Saturday(value is 0 or 1)

Parameter 8: (alarm beep switch) (AOF pull key switch)

​      				0: alarm beep off

​					  1: alarm beep on

##### System parameter settings

```java
void Channel.setDeviceAlarm("1", "2", "0", "1", "6", "8", "3", "1");
```

Parameter 1: time mode

​						0: 12 hour mode

​						1: 24-hour mode

Parameter 2: synchronization interval

​						0: every day

​						1: weekly

​						2: monthly

Parameter 3: temperature unit

​						0: Celsius

​						1: Fahrenheit

Parameter 4: hour reporting time 0: off 1: on

Parameter 5: start time (hours)

Parameter 6: end time (hours)

Parameter 7: display mode

​						0: single time mode

​						1: cycle mode

​						2: single date mode

​						3: single temperature mode

 Parameter 8: date display mode

​						0: MM-DD

​						1: DD-MM

##### Control command, turn off alarm sound, no SNZ

```java
void Channel.setMuteAlarm();
```

##### Control command, turn off the alarm sound, there is SNZ, that is, the alarm will ring again after 8 minutes

```
void Channel.setLazyAlarm();
```

