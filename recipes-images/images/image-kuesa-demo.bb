DESCRIPTION = "Kuesa Demo Image"
LICENSE = "AGPL"

require recipes-fsl/images/fsl-image-qt5.bb

inherit distro_features_check populate_sdk_qt5

# Install fonts
QT5_FONTS = " \
    ttf-dejavu-mathtexgyre \
    ttf-dejavu-sans \
    ttf-dejavu-sans-condensed \
    ttf-dejavu-sans-mono \
    ttf-dejavu-serif \
    ttf-dejavu-serif-condensed \
"

# Install QT5 demo applications
QT5_IMAGE_INSTALL = " \
    ${QT5_FONTS} \
"

IMAGE_INSTALL += " \
    ${QT5_IMAGE_INSTALL} \
    kuesa \
"
