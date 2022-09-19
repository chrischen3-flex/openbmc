SUMMARY = "BMC Health Monitoring"
DESCRIPTION = "Daemon to collect and monitor bmc health statistics"
HOMEPAGE = "https://github.com/openbmc/phosphor-health-monitor"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9e69ba356fa59848ffd865152a3ccc13"
DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "phosphor-logging"
DEPENDS += "nlohmann-json"
SRCREV = "b7d7bd5a384ea501766b15e4613eb9b14fe71e7f"
PR = "r1"

SRC_URI = "git://github.com/openbmc/phosphor-health-monitor.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
SYSTEMD_SERVICE:${PN} = "phosphor-health-monitor.service"

inherit meson pkgconfig
inherit systemd
