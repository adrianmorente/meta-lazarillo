SUMMARY = ""
LICENSE = ""

inherit core-image lazarillo-class

GLIBC_GENERATE_LOCALES = "es_ES.UTF-8"

###################################################
# Groups of needed packages

CORE_PKGS = " \
    kernel-devicetree \
    kernel-image \
    kernel-modules \
    openssl \
    "

MISC_PKGS = " \
    curl \
    nano \
    psplash \
    "

QT_PKGS = " \
    qtbase qtbase-plugins qtbase-tools \
    qtdeclarative qtdeclarative-qmlplugins \
    qtgraphicaleffects qtgraphicaleffects-qmlplugins \
    qtmultimedia qtmultimedia qtmultimedia-plugins qtmultimedia-qmlplugins \
    qtquickcontrols qtquickcontrols-qmlplugins \
    qtquickcontrols2 qtquickcontrols2-qmlplugins \
    qtvirtualkeyboard qtvirtualkeyboard-plugins qtvirtualkeyboard-qmlplugins \
    "

LAZARILLO_PKGS = " \
    lazarillo-hmi \
    "

###################################################
# Installation of grouped packages

IMAGE_FEATURES += " \
    autologin \
    "

IMAGE_INSTALL += " \
    ${CORE_PKGS} \
    ${MISC_PKGS} \
    ${QT_PKGS} \
    ${LAZARILLO_PKGS} \
    "
