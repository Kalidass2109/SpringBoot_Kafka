
===============
Apache Kafka
===============

=> Kafka is a Message broker

=> Kafka is used as Streaming platform

=> Kafka is used for realtime data processing

=> Kafka works based on pub & sub model

		publisher : App which is producing msgs

		subscriber : App which is consuming msgs

===================
Kafka Architecture
===================

1) Zookeeper

2) Kafka Server

3) Kafka Topic

4) Publisher App

5) Subscriber (Consumer/Listener)

========================================
Apache Kafka Setup In Windows
========================================

## Step-1 : Download Zookeeper from below URL

   URL : http://mirrors.estointernet.in/apache/zookeeper/

## Step-2 : Download Apache Kafka from below URL

   URL : http://mirrors.estointernet.in/apache/kafka/

## Step-3 : Set Path to ZOOKEEPER in Environment variables upto bin folder

### Note: Copy zookeeper.properties and server.properties files from kafka/config folder to kafka/bin/windows folder. ###

## Step-4 : Start Zookeeper server using below command from kafka/bin/windows folder

    Command : zookeeper-server-start.bat zookeeper.properties

## Step-5: Start Kafka Server using below command from kafka/bin/windows folder

    Command : kafka-server-start.bat server.properties

Note: If kafka server is getting stopped, delete kafka logs from c:/tmp/ folder.    

## Step-6 : Create Kakfa Topic using below command from kafka/bin/windows folder

Command : kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic ashokit_topic

## Step-7 : View created Topics using below command

     Command : kafka-topics.bat --list --bootstrap-server localhost:9092


========================================
Apache Kafka Setup In Mac
========================================
1. Start Zookeeper Server

	sh bin/zookeeper-server-start.sh config/zookeeper.properties

2. Start Kafka Server / Broker

	sh bin/kafka-server-start.sh config/server.properties

3. Create topic

	sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --topic NewTopic --partitions 3 --replication-factor 1

4. list out all topic names

	sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --list

5. Describe topics

	sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic NewTopic

6. Produce message

	sh bin/kafka-console-producer.sh --broker-list localhost:9092 --topic NewTopic

7. consume message

	sh bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic NewTopic --from-beginning

