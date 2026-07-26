FROM nginx:alpine

LABEL org.opencontainers.image.title="VMS-MMA Docker Test"
LABEL org.opencontainers.image.description="Docker workstation validation image"

COPY index.html /usr/share/nginx/html/index.html

EXPOSE 80

HEALTHCHECK --interval=10s --timeout=3s --start-period=5s --retries=3 \
    CMD wget --quiet --tries=1 --spider http://127.0.0.1/ || exit 1
