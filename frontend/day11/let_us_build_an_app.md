* Let's build a react application from scratch and discuss a lot of things in the process

### Part I

* create a react application **midweek-react-app**
* Install **react-router-dom** library
* Start your development server

### Part II

* Let's define a folder structure for the application

```
[src]
   -- [assets]
            -- [fonts]
            -- [styles]
                    *.css
            -- [images] 
                    images, icons
   -- [layouts]
   -- [routes]
   -- [services]
            -- [reducers]
            -- [actions]
   -- [apis]
         backend-api-call code
   -- [components]
         - [component-name]
                -- <Component.js>
                -- <Component.test.js>
         - [app]
                -- App.js
                -- App.test.js       
         - [guessing-game]
                -- GuessingGame.js
                -- GuessingGame.test.js
   -- [utils]  

```

### Part III

* Define MainLayout.js
* Define PublicRoutes
* Render them in App.js

### Part IV

* The links Lab01, Lab02 are very suffocating in the main layout. Because you cannot add more labs.
* So let's change it to **Labs**
* Clicking on Labs will render links to Lab01 and Lab02 in the main content.
* **Hint:** define LabsLayout with children Lab01 and Lab02 and connect with the main layout in PublicRoutes


### Part V

* Use **https://github.com/prabhu-sunderaraman/full-stack-2024/blob/main/frontend/day10-more-hooks-app/src/reducerExample1/CountryViewWithReducer.js**
* Show this Country View with Reducer component when you click lab01


### Part VI

* Let's build some backend

* Create a folder [backend-app]. *Note: Not inside your react application folder* 
* Create a file package.json with the following contents

``` json
{
  "name": "backend-app",
  "version": "1.0.0",
  "description": "",
  "main": "server.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "start": "node server.js"
  },
  "author": "",
  "license": "ISC",
  "dependencies": {
    "cors": "^2.8.5",
    "express": "^4.19.2"
  }
}

```

* Create a file server.js with the following contents

``` javascript
const app = require('express')();
const cors = require('cors');

app.use(cors({
    origin: '*'
}));


app.get('/message', (req, res) => {
    res.send("Hi there");
});

app.listen(8000, () => {
    console.log("server started in 8000");
});
```

* Open your command prompt or Terminal and navigate to [backend-app] folder
* Run the command npm i in Windows or sudo npm i in Mac
* Run node server.js command to start the backend server

##### ToDo

* Modify Home component to connect to http://localhost:8000/message and display the output


### Part VII

* So far we have been developing this application using a development server.
* Time to build your application and deploy it in some other server
* Stop your development server and run the following command

```
sudo npm run build
```

* Notice a **build** folder generated
* Observe the contents

* You can deploy the contents of build in server of your choice
* For example you can install this tool

```
sudo npm i -g serve
```

* And run this command

```
serve -s build
```

### Part VIII

* Create a Lab03 component; Add a router to Lab03 appropriately
* Build a simple form with the following UI components (with static data)
* name, email, years of experience, country, Gender(Male, Female, Other) radio button and a submit button
* You are going to use Material UI

```
  sudo npm i --save @mui/material @emotion/react @emotion/styled
```

* https://mui.com/material-ui/all-components/


























