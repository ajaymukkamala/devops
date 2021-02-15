#!/bin/bash
systemctl
echo "shows all services"
systemctl | grep -v running  > /c/Users/Administrator/Documents/devops/bitbash.txt
echo "except running shows everything"

