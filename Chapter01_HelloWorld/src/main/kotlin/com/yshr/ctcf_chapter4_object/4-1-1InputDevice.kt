package com.yshr.ctcf_chapter4_object

/**
 * Created by yshr on 2017/9/22.
 * 输入设备（接口） -> usb（接口） ->具体对象 光电，带线
 *         -> 蓝牙
 */
interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

abstract class USBMouse(val name: String) : USBInputDevice, OpticalMouse {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return "$name"
    }


}

class LogitechMouse:USBMouse("罗技鼠标"){

}
//光电鼠标
interface OpticalMouse {

}

class Computer {
    fun addUSBInputDevice(inputDevice: USBInputDevice) {
        //插入输入设备
        println("add usb input device:$inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice) {
        //插入输入设备
        println("add ble input device:$inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            else -> {
                throw IllegalArgumentException("输入的设备类型不支持")
            }
        }
    }
}

fun main(args: Array<String>) {
    val computer = Computer()
    val mouse = LogitechMouse()
    computer.addInputDevice(mouse)
}