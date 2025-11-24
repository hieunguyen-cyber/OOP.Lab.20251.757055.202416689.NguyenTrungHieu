#!/bin/bash

# Automated test for Exercise 13 - AIMS Console Application

cd /Users/hieunguyen/OOP_Lab/Lab04/AimsProject

echo "Testing AIMS Console Application..."
echo ""

# Test 1: View store and exit
echo "=== TEST 1: View Store ===" 
echo -e "1\n0\n0" | java -cp bin hust.soict.dsai.aims.Aims 2>&1 | head -40

echo ""
echo "=== TEST 2: Add media to cart and view ===" 
echo -e "1\n2\nThe Lion King\n1\n0\n3\n0\n0" | java -cp bin hust.soict.dsai.aims.Aims 2>&1 | head -50
