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





