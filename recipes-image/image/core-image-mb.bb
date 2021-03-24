DESCRIPTION = "ADLINK BSP Image with matchbox window manager"

LICENSE = "MIT"

IMAGE_FEATURES += " package-management ssh-server-dropbear hwcodecs x11-base x11-sato splash "

inherit core-image

REQUIRED_DISTRO_FEATURES = " x11 wifi "
IMAGE_INSTALL += " packagegroup-core-x11 "

TOOLCHAIN_HOST_TASK_append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK_remove_task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'
QB_MEM_qemumips = "-m 256"


IMAGE_INSTALL += " garcon xterm xclock twm xinit-env xserver-xorg mesa-demos glmark2 haveged adlinkspitool "

IMAGE_INSTALL_append = " packagegroup-base packagegroup-core-full-cmdline usbutils i2c-tools can-utils alsa-utils lmsensors-sensors dhcp-server dhcp-client pkgconfig connman-gnome startupconfig cmake packagegroup-core-buildessential vim python3-upm upm upm-dev python3-mraa mraa-utils mraa-dev mraa-doc mraa minicom git inetutils iw bluez5 kernel-devsrc sema4.0 matchbox-panel matchbox-config-gtk matchbox-desktop matchbox-session matchbox-session-sato matchbox-theme-sato matchbox-wm packagegroup-tools-bluetooth gnome-bluetooth blueman epiphany "


export IMAGE_BASENAME = "matchbox-sd"
