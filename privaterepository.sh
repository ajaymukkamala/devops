#!/bin/bash
echo "here you will see all the service"
systemctl
echo "these are services"
systemctl > /home/ec2-user/demo/one.txt
echo "output pushs in to file"
systemctl | grep -w running
echo "shows only running services"

