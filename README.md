# 🎟 SLYPE Ticket Tracking System

# 📝 Must have features:
- Create a ticket;
- Create a customer;
- Create a agent;
- Create email integration;
- Create dynamic and custom ticket fields.
   
# Default access
    user: admin@slype.com
    pass: nimda

# Swagger UI
    URL: localhost:8080/swagger-ui.html

# 🎲 Setting up BD local
    docker run --name slype_postgress -p 5432:5432 -e POSTGRES_PASSWORD=1234 -e POSTGRES_USER=postgres -e POSTGRES_DB=Slype-LocalDB -d postgres
    
# Default Data creation
   Run the following queries in your SQL editor:
    _____________________________________________________________________________________
    
    INSERT INTO tb_agent (name, email, password, updated_at, created_at)
    VALUES  ('Gabriel da Rocha', 'gdrocha@unisinos.br', '1234', now(), now()),
            ('Vinicius Bischoff', 'viniciusbischof@unisinos.br', '1234', now(), now()),
    _____________________________________________________________________________________
