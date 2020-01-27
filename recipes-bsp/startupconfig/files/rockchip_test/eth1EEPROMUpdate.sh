#!/bin/sh

mac_tmp=$1
m1=${mac_tmp:0:2}
m2=${mac_tmp:2:2}
m3=${mac_tmp:4:2}
m4=${mac_tmp:6:2}
m5=${mac_tmp:8:2}
m6=${mac_tmp:10:2}


ethtool -E eth1 magic 0x9500 offset 0x01 value 0x$m1
ethtool -E eth1 magic 0x9500 offset 0x02 value 0x$m2
ethtool -E eth1 magic 0x9500 offset 0x03 value 0x$m3
ethtool -E eth1 magic 0x9500 offset 0x04 value 0x$m4
ethtool -E eth1 magic 0x9500 offset 0x05 value 0x$m5
ethtool -E eth1 magic 0x9500 offset 0x06 value 0x$m6
