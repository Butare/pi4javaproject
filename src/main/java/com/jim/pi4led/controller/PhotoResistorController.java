package com.jim.pi4led.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinAnalogInput;
import com.pi4j.io.gpio.RaspiPin;

@RestController
public class PhotoResistorController {

	public static GpioPinAnalogInput pin;

	@RequestMapping("/sensordata")
	public String readData() {
		if (pin == null) {
			GpioController gpio = GpioFactory.getInstance();
			pin = gpio.provisionAnalogInputPin(RaspiPin.GPIO_02, "PhotoResistor");
		}
		double sensedValue = pin.getValue();
		return "Sensor Value : " + sensedValue;
	}

}
