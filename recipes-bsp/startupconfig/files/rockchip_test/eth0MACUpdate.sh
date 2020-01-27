#!/bin/sh

# Script to Update eth0 MAC address

#delay
sleep 5

echo "Script started"

f=`ethtool -e eth1 | grep 0x0000 | cut -d':' -f 2`

f0=`echo $f | cut -d' ' -f 2`
f1=`echo $f | cut -d' ' -f 3`
f2=`echo $f | cut -d' ' -f 4`
f3=`echo $f | cut -d' ' -f 5`
f4=`echo $f | cut -d' ' -f 6`
f5=`echo $f | cut -d' ' -f 7`

f=`ethtool -e eth1 | grep 0x0040 | cut -d':' -f 2`

e0=`echo $f | cut -d' ' -f 1`
e1=`echo $f | cut -d' ' -f 2`
e2=`echo $f | cut -d' ' -f 3`
e3=`echo $f | cut -d' ' -f 4`
e4=`echo $f | cut -d' ' -f 5`
e5=`echo $f | cut -d' ' -f 6`

echo $e0:$e1:$e2:$e3:$e4:$e5

ifconfig eth0 down

ifconfig eth0 hw ether $e0:$e1:$e2:$e3:$e4:$e5

ifconfig eth0 up

ifconfig eth1 up

echo "eth0 mac updated"

