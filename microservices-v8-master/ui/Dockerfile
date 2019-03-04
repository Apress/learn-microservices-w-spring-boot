#
# docker build -t my-jetty .
#
FROM jetty:jre8

WORKDIR /var/lib/jetty
# 
COPY webapps/ webapps
COPY start.d/ start.d
#
EXPOSE 9090
