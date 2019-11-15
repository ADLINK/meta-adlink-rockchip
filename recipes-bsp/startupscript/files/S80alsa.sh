# Startup script 
alsactl restore 0 -f /var/lib/alsa/asound.state

sed -i 's/eth0/eth0 eth1/g' /etc/ifplugd/ifplugd.conf


