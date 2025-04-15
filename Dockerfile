FROM openjdk:11
ADD target/springbootdockerjenkinspipeline.jar springbootdockerjenkinspipeline.jar
EXPOSE 9025
ENTRYPOINT ["java", "-jar", "/springbootdockerjenkinspipeline.jar"]