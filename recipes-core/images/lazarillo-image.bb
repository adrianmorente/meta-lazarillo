SUMMARY = "Embedded OS for Lazarillo devices."
LICENSE = "GPLv3"

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

NETWORKING_PKGS = " \
    iw \
    wpa-supplicant \
    dhcpcd \
    networkmanager \
    "

QT_PKGS = " \
    qtbase qtbase-plugins qtbase-tools \
    qtdeclarative qtdeclarative-qmlplugins \
    qtgraphicaleffects qtgraphicaleffects-qmlplugins \
    qtmultimedia qtmultimedia-plugins qtmultimedia-qmlplugins \
    qtquickcontrols qtquickcontrols-qmlplugins \
    qtquickcontrols2 qtquickcontrols2-qmlplugins \
    qtvirtualkeyboard qtvirtualkeyboard-plugins qtvirtualkeyboard-qmlplugins \
    qtxmlpatterns \
    "

LAZARILLO_PKGS = " \
    lazarillo-embedded \
    "

###################################################
# Installation of grouped packages

IMAGE_FEATURES += " \
    autologin \
    ssh-server-dropbear \
    "

IMAGE_INSTALL += " \
    ${CORE_PKGS} \
    ${LAZARILLO_PKGS} \
    ${MISC_PKGS} \
    ${NETWORKING_PKGS} \
    "
    # ${QT_PKGS} \
