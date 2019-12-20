DESCRIPTION = "ADLINK BSP Image with XFCE X Window"

LICENSE = "MIT"

IMAGE_FEATURES += " package-management ssh-server-dropbear hwcodecs"

inherit core-image

REQUIRED_DISTRO_FEATURES = " x11 "

IMAGE_INSTALL += "packagegroup-core-x11 \
		  packagegroup-xfce-base"
		  

### XFCE Tools
IMAGE_INSTALL += " xterm xclock twm xinit-env xserver-xorg mesa-demos glmark2 haveged adlinkmraa xfdesktop "

export IMAGE_BASENAME = "xfce"
