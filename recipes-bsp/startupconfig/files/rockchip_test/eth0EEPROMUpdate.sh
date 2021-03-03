#!/bin/sh

mac_tmp=$1
m1=${mac_tmp:0:2}
m2=${mac_tmp:2:2}
m3=${mac_tmp:4:2}
m4=${mac_tmp:6:2}
m5=${mac_tmp:8:2}
m6=${mac_tmp:10:2}


ethtool -E eth1 magic 0x9500 offset 0x40 value 0x$m1
ethtool -E eth1 magic 0x9500 offset 0x41 value 0x$m2
ethtool -E eth1 magic 0x9500 offset 0x42 value 0x$m3
ethtool -E eth1 magic 0x9500 offset 0x43 value 0x$m4
ethtool -E eth1 magic 0x9500 offset 0x44 value 0x$m5
ethtool -E eth1 magic 0x9500 offset 0x45 value 0x$m6
