Testing in CI/CD Pipeline

Continuous Integration
adalah praktik mengintegrasikan kode kedalam repository bersama dan membangun/menguji setiap perubahan secara otomatis sedinni mungkin biasanya beberapa kali sehari.

Continous Delivery/Deployment
Continous delivery menambahkan suatu software yanh bisa relase ke sebuat produksi setiap waktu. Dan juga otomatis mendoting perubahan ke sebuah staging sistem

Delivery vs Deployement
1. Delivery 
- Otomatis persiapan dan jalur sebuah relase ke produksi
2. Deployment
- Setiap berganti sebuah source code yang di hngun ke sebuah produksi otomatis, tanpa sebuah explicit penerimaan dari seorang pengembang

Continous Delivery
1. Build - Test - Acceptence test - deploy to staging - deploy to production (manual)
Continous Delivery
2. Build - test - acceptence test - deploy to staging - deploy to production (automatic)

Apa yang membuat Bagus CI
1. Decoupled Stages
2. Repetable
3. Fail fast

Apa yang membuat bagus CD
1. Design with system in mind
2. Pipelines
3. Globally unique version

CI/CD proses
1. Commit
2. Build.
3. Test
4. Deploy

Manfaat implementasi CI
1. Mendeteksi bug
2. Mengurangi masalah 
3. Membangun proses transparan
4. Efisien

Manfaat implementasi CD
1. Mengurangi resiko
2. Sedikit memhangun
3. Mengurangi biaya
4. Otomatis dan proses transparan
5. Mengirim dengan banyak frekuensi

Biaya Continous integration 
1. Menulis test otomatis
2. Server untuk test otomafis
3. Penggabungan code terbuka dan memungkinkan

Biaya Continous delivery
1. Fondasi yang kuat dalam CI
2. Membutuhkan kualitas tinggi ditest
3. Dokumengasi butuh sebuah update rutin

CI/CD alat
1. Jenkins
- sebuah opensource 
- mudah di instal
- bisa lebih 1000 plugins
- dibangun dengan java
- gratis biaya
- otomatis monitor code kualitas
2. Bamboo
3. Circleci
4. Aws codebuild
- skala berkelanjutan
- ekstensible
- keamanan
- integtasu dan pengiriman dengan tools lain
5. Azure devops
- gratis
- penuh features
- mendukung net
- cepat dan proses mudah
6. Ci/cd
7. Travis ci
8. Github actions
- hosted vm with multiple os
- ci template
- sederhana os testing
- gratis

Github actions
Komponen
1. Workflows
2. Jobs
3. Actions
4. Events
5. Runners

Persiapan
- java 1.8
- maben
- intellij idea
- git

Prosces
1. Instal java
2. Instal maven
3. Instal git
4. Instal intellij
5. Create new project
6. Setup folder
7. Create scenario
8. Create test steps
9. Run api test
10. Create workflow
11. Create new repository
12. Push to new repository
13. Monitoring and check result