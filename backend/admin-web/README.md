# Servlet3MavenArchetype
this is a maven archetype , which will built a java web program , based on servlet 3.1

### how to use it 

* get the source code 

* generate generated-sources folder , by the following code:

```
	
	mvn archetype:create-from-project

``` 

* go to target/generated-sources/archetype , and make archetype installed to your local maven storage

```

	mvn install


```

* open the target/generated-sources/archetype/pom.xml , it should like this :

```

  <groupId>com.liumapp.servlet3mavenarchetype</groupId>
  <artifactId>servlet3mavenarchetype-archetype</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>maven-archetype</packaging>

```

* build your new maven project anywhere you like :

```

mvn archetype:generate -DarchetypeGroupId=com.liumapp.servlet3mavenarchetype -DarchetypeArtifactId=servlet3mavenarchetype-archetype -DarchetypeVersion=1.0-SNAPSHOT

```

* enjoy your coding with Servlet3.1