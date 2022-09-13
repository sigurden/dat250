# JPA - Experiment 2

## Issues                                                                   

Had some issues with the many to many ralations between person and address,
but found an example online using jointable and mappedby and
manage to crate a propper relation between the objects.

## Inspecting DB

In inspecting the DB, I used the including `ij` tool to connect to Derby DBs in the terminal.
For ease of use and quicly testing while doing the excerise, I created a small and [simple 
SQL script](https://github.com/sigurden/dat250/blob/main/ressources/expass2/test.sql), listing out the content of the tables used in the program.

![This is an image](https://github.com/sigurden/dat250/blob/main/ressources/expass2/Screenshot%20from%202022-09-12%2023-08-22.png)


## Conclusion

I was able to use JPA to create a persistent DB layer, and made the unit test pass.
