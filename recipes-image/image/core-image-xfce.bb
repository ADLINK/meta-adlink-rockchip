DESCRIPTION = "ADLINK BSP Image with XFCE X Window"

LICENSE = "MIT"

IMAGE_FEATURES += " package-management ssh-server-dropbear hwcodecs"

inherit core-image

REQUIRED_DISTRO_FEATURES = " x11 wifi "

IMAGE_INSTALL += "packagegroup-core-x11 \
		  packagegroup-xfce-base \
		  packagegroup-xfce-extended"
		  

### XFCE Tools
IMAGE_INSTALL += " garcon xterm xclock twm xinit-env xserver-xorg mesa-demos glmark2 haveged xfdesktop adlinkspitool "

IMAGE_INSTALL_append = " packagegroup-base packagegroup-core-full-cmdline usbutils i2c-tools can-utils alsa-utils lmsensors-sensors dhcp-server dhcp-client pkgconfig connman-gnome startupconfig cmake packagegroup-core-buildessential vim python3-upm upm upm-dev python3-mraa mraa-utils mraa-dev mraa-doc mraa minicom git inetutils iw bluez5 kernel-devsrc sema4.0 "


export IMAGE_BASENAME = "xfce-sd"
