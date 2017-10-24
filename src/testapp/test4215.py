#test4215.py
#power on/off test
#
#
#
#
import commands


# pci = "00:00.0 Host bridge: Intel Corporation 82845 845 (Brookdale) Chipset Host Bridge (rev 04) \
#      00:01.0 PCI bridge: Intel Corporation 82845 845 (Brookdale) Chipset AGP Bridge(rev 04) \
#      00:1d.0 USB Controller: Intel Corporation 82801CA/CAM USB (Hub #1) (rev 02)\
#      00:1d.1 USB Controller: Intel Corporation 82801CA/CAM USB (Hub #2) (rev 02)\
#      00:1e.0 PCI bridge: Intel Corporation 82801 Mobile PCI Bridge (rev 42)\
#      00:1f.0 ISA bridge: Intel Corporation 82801CAM ISA Bridge (LPC) (rev 02)\
#      00:1f.1 IDE interface: Intel Corporation 82801CAM IDE U100 (rev 02)\
#      00:1f.3 SMBus: Intel Corporation 82801CA/CAM SMBus Controller (rev 02)\
#      00:1f.5 Multimedia audio controller:Intel Corporation 82801CA/CAM AC'97 Audio Controller (rev 02)\
#      00:1f.6 Modem: Intel Corporation 82801CA/CAM AC'97 Modem Controller (rev 02)\
#      01:00.0 VGA compatible controller: nVidia Corporation NV17 [GeForce4 420 Go](rev a3)\
#      02:00.0 FireWire (IEEE 1394): VIA Technologies, Inc. IEEE 1394 Host Controller(rev 46)\
#      02:01.0 Ethernet controller: Realtek Semiconductor Co., Ltd. RTL-8139/8139C/8139C+(rev 10)\
#      02:04.0 CardBus bridge: O2 Micro, Inc. OZ6933 Cardbus Controller (rev 01)\
#      02:04.1 CardBus bridge: O2 Micro, Inc. OZ6933 Cardbus Controller (rev 01)"
lspci = commands.getoutput("lspci | grep Eth")
nicNumbers = lspci.count("i350")
with open("/home/reboot.txt", 'r') as fileObj:
    rebootStr = fileObj.read()
rebootInt = int(rebootStr)
rebootInt = rebootInt+1
print "reboot times: %d" % rebootInt
with open("/home/reboot.txt", 'w') as fileObj1:
    fileObj1.write(str(rebootInt))
if nicNumbers == 16:
    with open("/home/count.txt", 'r') as  fileRead:
        countStr = fileRead.read()
    count = int(countStr)
    count = count+1
    countStr1 = str(count)
    with open("/home/count.txt", 'w') as fileWrite:
        countStr1 = fileWrite.write(countStr1)
else:
    with open("/home/error.txt", 'w') as fileObj2:
        fileObj2.write(lspci)
if rebootInt<1000:
    commands.getoutput("sleep 30")
    commands.getoutput("reboot")

