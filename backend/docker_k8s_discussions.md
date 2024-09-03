### Docker

* Docker provided a way by which you can install ANY application(or sw) in your system
* MySQL 4; MySQL 5 -> java 1.5, java 11
* As developers we all develop applications in different OS; So when you deploy applications in a different OS; the unforeseen problems start

* Docker provides a virtual BOX (or crudely a VM)

* Installing Docker Desktop, gives you the required tools(**docker server and client**) to work with docker

### Containers

* Every docker container is a Linux box
* When you create a container you are actually creating  Linux Virtual Machine in your **host** machine
* Say, you want to install Postgres; *You create a Postgres container (ie., a Linux VM with Postgres server installed)*
* You want to install MySQL; *You create a MySQL container(ie., a Linux VM with MySQL server installed)*
* Say, you want to install Kafka; *You create a Kafka container (ie., a Linux VM with Kafka server installed)*

### Images

* In OO, you want to create a Person Object;
* You need a Person class;
* In OO, you want to create a Car Object;
* You need a Car class;
<br/>

* In Docker, you want to create a MySQL container;
* You need a MySQL image;
* In Docker, you want to create a MongoDB container;
* You need a MongoDB image;

### Where do you find the image?


* You find it in docker hub; https://hub.docker.com

```
docker pull <imageName>
docker pull mysql:latest
```

### How do you create a container?

```
docker run --name <containerName> <options> <imageName>
```

```
docker run -d --name hello_mysql -p9000:3306 -e MYSQL_ROOT_PASSWORD=indium mysql:latest
```


### For Postgres

```
docker run --name training-postgres -p5432:5432 -e POSTGRES_PASSWORD=passwd -d postgres
docker run -p 8080:80 \   
    -e 'PGADMIN_DEFAULT_EMAIL=user@domain.com' \
    -e 'PGADMIN_DEFAULT_PASSWORD=SuperSecret' \
    -d dpage/pgadmin4

```

* Launch http://localhost:8080
* Feed in your user email and password
* Register a server by specifying host as **host.docker.internal**



### Some commands

```
docker images
docker rmi -f <imageId>
docker ps
docker logs <containerId>
docker stop <containerId>	
docker run --rm 	
```

* **--rm** option is used while starting a container to remove it on stop

### build

```
docker build -t my-rest-api:0.0.1 .
```


### k8s

* Orchestration tool
* manage the containers; scalability
* Basic building block of k8s is **POD**
* A pod is a wrapper to the container
* So when somebody says **Kubernetize your application**; this is what she means
* Create an application; containerize it using docker(or podman); convert the docker image to a POD and deploy them

### Working with k8s

* "Enable Kubernetes" in Docker Desktop, you get all the tools to work with k8s

```
kubectl version
```

* Enabling Kubernetes in Docker Desktop; by default creates a single node cluster - called **docker-desktop**

```
kubectl config get-contexts
```

























