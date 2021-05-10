/* name - "Slim", type - "Giraffe", country_id - 1 */

INSERT INTO Animals (name, type, country_id) VALUES ('Slim', 'Giraffe', 1);

SELECT
    name, type, country
FROM
    Animals
INNER JOIN
    Countries
ON
    Animals.country_id = Countries.id
ORDER BY country ASC;