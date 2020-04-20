#!/bin/sh

#Enable wifi
rfkill unblock wifi > /dev/null 2>&1
sleep 5

#Reset USB device
hciconfig | grep -i UP
if [ $? -eq 0 ]; then
   exit 
fi

for X in /sys/bus/usb/devices/*; do
    echo "$X"
    cat "$X/idVendor" | grep -i "7392"
    if [ $? -eq 0 ]; then
    var="$X"
    fi
done

echo 0 > $var/authorized
echo 1 > $var/authorized
sleep 2
echo 0 > $var/authorized
echo 1 > $var/authorized

