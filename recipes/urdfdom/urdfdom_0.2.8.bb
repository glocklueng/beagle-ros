DESCRIPTION = "The URDF (U-Robot Description Format) library provides core data structures and a simple XML parsers for populating the class data structures from an URDF file."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;beginline=2;endline=2;md5=4899473e78369893d3ddc4a151717465"

#DEPENDS = "libtinyxml console-bridge"

SRC_URI = "https://github.com/ros/urdfdom/archive/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI[md5sum] = "c2332953b8ee7f4dd23684e700fae14e"
SRC_URI[sha256sum] = "a918d3ae4366504a93d6af780ac1e706cdffad4b621a363a9bd53c5fbf32fe21"

S = "${WORKDIR}/urdfdom-${PV}"

#inherit catkin