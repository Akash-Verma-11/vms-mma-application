# VMS-MMA Application

This repository contains the VMS-MMA application source code, tests, Dockerfiles and CI pipeline configuration.
_______________________________________________________________________________________________________________________________________________________________________________________
==> Application Repository Structure

vms-mma-application/
├── services/
│   ├── vms-mma-auth-service/
│   ├── vms-mma-product-service/
│   ├── vms-mma-cart-service/
│   ├── vms-mma-order-service/
│   ├── vms-mma-payment-service/
│   ├── vms-mma-inventory-service/
│   └── vms-mma-notification-service/
│
├── frontend/
│   └── vms-mma-frontend/
│
├── docker/
│   ├── docker-compose.yml
│   └── .env.example
│
├── scripts/
│   ├── build.sh
│   ├── test.sh
│   └── local-start.sh
│
├── Jenkinsfile
├── pom.xml
├── .gitignore
└── README.md

==> Each Java service will eventually contain:

service-name/
├── src/
│   ├── main/
│   └── test/
├── pom.xml
├── Dockerfile
├── .dockerignore
└── README.md

_______________________________________________________________________________________________________________________________________________________________________________________
