# استخدم صورة base تحتوي على JDK
FROM openjdk:latest

WORKDIR /application



# نسخ الملف إلى المجلد الصحيح
COPY JavaApplication1.java .

# تجميع الملف داخل المجلد
RUN javac JavaApplication1.java

# تحديد الأمر الافتراضي لتشغيل التطبيق مع المسار الكامل
CMD JavaApplication1


