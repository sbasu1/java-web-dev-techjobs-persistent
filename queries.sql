## Part 1: Test it with SQL
select * from job
## Part 2: Test it with SQL
select * from employer where location='St. Louis'
## Part 3: Test it with SQL
DROP TABLE job
## Part 4: Test it with SQL
SELECT s.name,s.description FROM skill s where s.id in (select skills_id from job_skills) order by name