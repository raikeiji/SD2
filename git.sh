#!/bin/bash

echo "menambah masukkan file"
git add .
echo "memberikan status"
git status
echo "proses commit"
git commit -m "file baru sudah diupload"
echo "memberikan status"
git status
echo "melakukan proses pushing"
git push -u origin master
echo "memberikan status terakhir"
git status
