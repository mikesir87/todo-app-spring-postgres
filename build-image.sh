#!/usr/bin/env sh

set -ex

docker buildx build --builder cloud-docker-devrel -t todo-demo-application:latest .
