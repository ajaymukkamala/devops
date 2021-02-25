#!/bin/bash
systemctl
echo "shows all services"
systemctl | grep -v running  
echo "except running shows everything"

