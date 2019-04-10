#
# This is the official kuesa metalayer as available on github.com/KDAB/kuesa
# 
#

SUMMARY = "Kuesa"
SECTION = "3D"
LICENSE = "AGPL"
LIC_FILES_CHKSUM = "file://LICENSE.AGPL.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "gitsm://github.com/KDAB/kuesa.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
inherit qmake5
OE_QMAKE_PATH_HEADERS = "${OE_QMAKE_PATH_QT_HEADERS}"
OE_QMAKE_RECURSIVE = ""
DEPENDS += " \
	qtbase \
	qt3d \
"

RDEPENDS_${PN} += " \
	bash \
	qtquickcontrols \
	qtquickcontrols2 \
	qtbase-plugins \
	qtdeclarative-qmlplugins \
"

FILES_${PN} += " \
       /usr/share/examples \
	/usr/lib/qml \
"
FILES_${PN}-dev += " \
  /usr/lib/libKuesa.prl \
  /usr/lib/mkspecs \
  /usr/lib/cmake \
"
