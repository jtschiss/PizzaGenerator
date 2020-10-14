UPDATE toppings t
JOIN (SELECT count(topping_id) as count, topping_id
    FROM liked_toppings
    GROUP BY topping_id) as x
on t.id = x.topping_id
SET t.popularity = x.count
WHERE t.id = x.topping_id;
