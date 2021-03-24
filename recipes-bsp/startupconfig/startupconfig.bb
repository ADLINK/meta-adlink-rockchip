SUMMARY = "Adlink startup script"
DESCRIPTION = "This is a system daemon implementing the Adlink startup script"
LICENSE = "CLOSED"


SRC_URI = "\
    file://adlinkstartup \
    file://adlinkstartup.service \
    file://disablevim.service \
    file://disablemailreader.service \
    file://disablemenulibre.service \
    file://rockchip_test \
    file://rtl_bt \
"

inherit pkgconfig systemd 

SYSTEMD_PACKAGES += "${PN}"
SYSTEMD_SERVICE_${PN} = "adlinkstartup.service disablevim.service disablemailreader.service disablemenulibre.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

INITSCRIPT_NAME = "adlinkstartup"
INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 19 0 1 6 ."

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "root"

do_install() {
    install -d "${D}${sysconfdir}/init.d"
    install -m 0755 "${WORKDIR}/adlinkstartup" "${D}${sysconfdir}/init.d/adlinkstartup"
   
    if ${@bb.utils.contains("DISTRO_FEATURES", 'systemd', 'true', 'false', d)}; then

       install -d "${D}/home/root/rockchip_test"
       install -m 0755 "${WORKDIR}/rockchip_test/eth0MACUpdate.sh" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/eth0EEPROMUpdate.sh" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/eth1EEPROMUpdate.sh" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/client.conf" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/pulse.conf" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/pulseaudio.service" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/wifi_test.sh" "${D}/home/root/rockchip_test/"
       install -m 0755 "${WORKDIR}/rockchip_test/exo-web-browser.desktop" "${D}/home/root/rockchip_test/"
       
       install -d "${D}${sbindir}"
       install -m 0755 "${WORKDIR}/adlinkstartup" "${D}${sbindir}/adlinkstartup"

       install -d "${D}${systemd_unitdir}/system"
       install -m 0644 "${WORKDIR}/adlinkstartup.service" "${D}${systemd_unitdir}/system/adlinkstartup.service"
       install -m 0644 "${WORKDIR}/disablevim.service" "${D}${systemd_unitdir}/system/disablevim.service"
       install -m 0644 "${WORKDIR}/disablemailreader.service" "${D}${systemd_unitdir}/system/disablemailreader.service"
       install -m 0644 "${WORKDIR}/disablemenulibre.service" "${D}${systemd_unitdir}/system/disablemenulibre.service"

       install -d "${D}/lib/firmware/rtl_bt"
       install -m 0755 "${WORKDIR}/rtl_bt/rtl8723b_config" "${D}/lib/firmware/rtl_bt/"
       install -m 0755 "${WORKDIR}/rtl_bt/rtl8723b_config.bin" "${D}/lib/firmware/rtl_bt/"
       install -m 0755 "${WORKDIR}/rtl_bt/rtl8723b_fw" "${D}/lib/firmware/rtl_bt/"
       install -m 0755 "${WORKDIR}/rtl_bt/rtl8723b_fw.bin" "${D}/lib/firmware/rtl_bt/"

    fi
}

FILES_${PN} += "\
    ${systemd_unitdir}/system-preset \
    ${systemd_unitdir}/system/adlinkstartup.service \
    ${systemd_unitdir}/system/disablevim.service \
    ${systemd_unitdir}/system/disablemailreader.service \
    ${systemd_unitdir}/system/disablemenulibre.service \
    /home/root/rockchip_test \
    /lib/firmware/rtl_bt \
"


