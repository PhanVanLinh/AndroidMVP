# AndroidMVP

Base on
https://github.com/googlesamples/android-architecture/tree/todo-mvp

### Basic of MVP
User interact on **View**, **View** send action to **Presenter**.  
**Presenter** control **Model**.  
After **Model** update finish, **Presenter** will control to update **View** UI.  

(**View** don't know **Model**)

### Business logic + UI Logic

**Business** logic should handle in **Model**.   
**UI** logic should handle in **Presenter**  

UI logic, example like logic for show hide view, show hide loading progress, ...

### Different between MVP and MVC
Check MVC demo