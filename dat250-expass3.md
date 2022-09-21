# Software Technology Experiment Assignment 3 - MongoDB

Some screenshots from when I followed MongoDBs beginner tutorial. It went mostly fine, but was a little bit tricky finding good learning ressourses on the map-reduce part when implementing a own operation. My orginal idea was a little complicated, so found an easier problem to solve.

## Screenshots


### Validate installation package
![Screenshot from 2022-09-20 21-42-57](https://user-images.githubusercontent.com/109481934/191600594-8e49ff61-1208-4c41-a9e5-21196abf059e.png)

### Experiment 1 - CRUD

- Create
![Screenshot from 2022-09-18 18-17-06](https://user-images.githubusercontent.com/109481934/191601082-cc949e54-b6af-4ed7-8d15-803da97d0819.png)

- Read
![Screenshot from 2022-09-18 18-27-50](https://user-images.githubusercontent.com/109481934/191601328-02a0f72d-d4de-483d-bdee-9aec903c4624.png)


- Update
![Screenshot from 2022-09-18 18-54-51](https://user-images.githubusercontent.com/109481934/191601420-b5096cf5-3522-433f-b4a9-63f1c5f2b4f9.png)

- Delete
![Screenshot from 2022-09-21 22-25-08](https://user-images.githubusercontent.com/109481934/191603474-57b58ce8-26c5-43ac-8777-5565bbc071dd.png)

- Bulk
![Screenshot from 2022-09-19 13-40-58](https://user-images.githubusercontent.com/109481934/191601499-4728cb38-93e7-40a1-87b5-e9ce6c45630e.png)


### Experiment 2 - Aggregation

Example code from tutorial:
![Screenshot from 2022-09-21 10-08-04](https://user-images.githubusercontent.com/109481934/191601581-a099e4de-8d27-4c61-9658-4c72d2d6e90e.png)

I changed the mapping function to use the date as key instead of a name. 
This way you can sum up the orders per day and can use it for instance in accounting.
![Screenshot from 2022-09-21 11-39-41](https://user-images.githubusercontent.com/109481934/191601606-a5911003-7dd7-4545-ad8e-2caf7ab5293f.png)
