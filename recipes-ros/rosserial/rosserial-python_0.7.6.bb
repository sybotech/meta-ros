DESCRIPTION = "A Python-based implementation of the ROS serial protocol."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

require rosserial.inc

SRC_URI[md5sum] = "c75ce886e36765d6c128c1123ff82efb"
SRC_URI[sha256sum] = "1eef7642859485d01d9665c17d7aded1c5d7c6320b884e4aba5d2d686c15029f"

RDEPENDS_${PN} = "rosserial-msgs diagnostic-msgs"
